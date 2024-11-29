package com.apihug.sample.wire.domain.student.repository;

import com.apihug.sample.wire.domain.bootstrap.config.SampleJdbcSupport;
import com.apihug.sample.wire.domain.student.StudentEntity;
import com.apihug.sample.wire.domain.student.dsl.StudentEntityDSL;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.data.persistence.CollapseHelper;
import hope.common.spring.data.persistence.spring.HopeJdbc;
import java.lang.Iterable;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
//TRAIT-import

@Repository
@SuppressWarnings("Duplicates")
public interface StudentEntityRepository extends HopeJdbc<StudentEntity>, SampleJdbcSupport, StudentEntityDSL, ListCrudRepository<StudentEntity, Long> {

  //==========TRAIT-BEGIN==========
  /**
   * Please put your customized SQL here,  any SQL other place will be dropped after merger!
   */
  interface _DerivedSQL {
  }

  //==========TRAIT-END==========

  Logger __StudentEntityLogger = LoggerFactory.getLogger(StudentEntity.class);

  @Override
  default Logger logger() {
    return __StudentEntityLogger;
  }

  default void _save(StudentEntity entity) {
    final AuditContext<Long, Long> ctx = auditContext();
    if (entity.getId() == null) {
      entity.setCreatedBy(ctx.getIdentifier());
      entity.setCreatedAt(LocalDateTime.now());
      entity.setVersion(persistenceContext().versionFrom());
      entity.setTenantId(ctx.getTenant());
    } else {
      entity.setUpdatedBy(ctx.getIdentifier());
      entity.setUpdatedAt(LocalDateTime.now());
      entity.setVersion(entity.getVersion() + 1);
    }
  }

  default void _saveAll(Iterable<? extends StudentEntity> entities) {
    final AuditContext<Long, Long> ctx = auditContext();
    final LocalDateTime now = LocalDateTime.now();
    final Long version = persistenceContext().versionFrom();
    entities.forEach(entity -> {
      if (entity.getId() == null) {
        entity.setCreatedBy(ctx.getIdentifier());
        entity.setCreatedAt(now);
        entity.setVersion(version);
        entity.setTenantId(ctx.getTenant());
      } else {
        entity.setUpdatedBy(ctx.getIdentifier());
        entity.setUpdatedAt(now);
        entity.setVersion(entity.getVersion() + 1);
      }
    } );
  }

  @Override
  default <S extends StudentEntity> S save(S entity) {
    _save(entity);
    return operations().save(entity);
  }

  @Override
  default <S extends StudentEntity> List<S> saveAll(Iterable<S> entities) {
    _saveAll(entities);
    return (List<S>) operations().saveAll(entities);
  }

  default void _deleteById(Long id) {
    final LocalDateTime now = LocalDateTime.now();
    namedJdbcTemplate().update(_SQL._DELETE_BY_ID, Map.of("deleted", true, "who" , auditContext().getIdentifier(), "when" , now, "id", id, "_deleted", false));
  }

  default void _deleteAllById(Iterable<? extends Long> ids) {
    final LocalDateTime now = LocalDateTime.now();
    namedJdbcTemplate().update(_SQL._DELETE_ALL_BY_ID, Map.of("deleted", true, "who" , auditContext().getIdentifier(), "when" , now, "ids", ids, "_deleted", false));
  }

  @Override
  default void deleteById(Long id) {
    _deleteById(id);
  }

  @Override
  default void delete(StudentEntity entity) {
    deleteById(entity.getId());
  }

  @Override
  default void deleteAll(Iterable<? extends StudentEntity> entities) {
    List<Long> ids = new ArrayList<>();
    entities.forEach(e -> ids.add(e.getId()));
    _deleteAllById(ids);
  }

  Optional<StudentEntity> findByIdAndTenantId(Long id, Long tenantId);

  default Optional<StudentEntity> findByIdAndCurrentTenant(Long id) {
    return findByIdAndTenantId(id, (Long) auditContext().getTenant());
  }

  boolean existsByIdAndTenantId(Long id, Long tenantId);

  default boolean existsByIdAndCurrentTenantId(Long id) {
    return existsByIdAndTenantId(id, (Long) auditContext().getTenant());
  }

  List<StudentEntity> findAllByIdInAndTenantId(List<Long> ids, Long tenantId);

  default List<StudentEntity> findAllByIdInAndCurrentTenantId(List<Long> ids) {
    return findAllByIdInAndTenantId(ids, (Long) auditContext().getTenant());
  }

  List<StudentEntity> findAllByTenantId(Long tenantId);

  default List<StudentEntity> findAllByCurrentTenantId() {
    return findAllByTenantId((Long) auditContext().getTenant());
  }

  default int update(final StudentEntity updated) {
    Optional<StudentEntity> existOptional = findById(updated.getId());
    if (existOptional.isPresent()) {
      StudentEntity exist = existOptional.get();
      return merge(exist, updated);
    }
    return 0;
  }

  default int merge(final StudentEntity exist, final StudentEntity updated) {
    final AuditContext<Long, Long> ctx = auditContext();
    final LocalDateTime now = LocalDateTime.now();
    final Map<String, Object> args = new HashMap<>();
    args.put("id", exist.getId());
    args.put("wealth", CollapseHelper.collapse(StudentEntity::getWealth, updated, exist));
    args.put("when", now);
    args.put("who", ctx.getIdentifier());
    args.put("version", exist.getVersion());
    return namedJdbcTemplate().update(_SQL._UPDATE, args);
  }

  default int updateByCurrentTenant(final StudentEntity updated) {
    Optional<StudentEntity> existOptional = findByIdAndCurrentTenant(updated.getId());
    if (existOptional.isPresent()) {
      StudentEntity exist = existOptional.get();
      return merge(exist, updated);
    }
    return 0;
  }

  @Transactional
  @Modifying
  default int deleteByVersion(Long id, Long version) {
    final Map<String, Object> args = new HashMap<>();
    args.put("deleted", true);
    args.put("who", auditContext().getIdentifier());
    args.put("when", LocalDateTime.now());
    args.put("id", id);
    args.put("version", version);
    args.put("_deleted", false);
    return namedJdbcTemplate().update(_SQL._DELETE_BY_VERSION, args);
  }

  /**
   * Those are H.O.P.E. generated SQL, do not modify manually, it will be overwritten every time !
   */
  interface _SQL {
    String _DELETE_BY_ID = "UPDATE STUDENT SET `DELETED` = :deleted, `DELETED_BY` = :who, `DELETED_AT` = :when, `UPDATED_BY` = :who, `UPDATED_AT` = :when, `VERSION` = VERSION + 1 WHERE `ID` = :id AND `DELETED` = :_deleted";

    String _DELETE_ALL_BY_ID = "UPDATE STUDENT SET `DELETED` = :deleted, `DELETED_BY` = :who, `DELETED_AT` = :when, `UPDATED_BY` = :who, `UPDATED_AT` = :when, `VERSION` = VERSION + 1 WHERE `ID` IN (:ids) AND `DELETED` = :_deleted";

    String _UPDATE = "UPDATE STUDENT SET `WEALTH` = :wealth, UPDATED_AT = :when, UPDATED_BY = :who, VERSION = VERSION + 1 WHERE `ID` = :id AND `VERSION` = :version";

    String _DELETE_BY_VERSION = "UPDATE STUDENT SET `DELETED` = :deleted, `DELETED_BY` = :who, `DELETED_AT` = :when, `UPDATED_BY` = :who, `UPDATED_AT` = :when, `VERSION` = `VERSION` + 1 WHERE `ID` = :id AND `VERSION` = :version AND `DELETED` = :_deleted";
  }
}