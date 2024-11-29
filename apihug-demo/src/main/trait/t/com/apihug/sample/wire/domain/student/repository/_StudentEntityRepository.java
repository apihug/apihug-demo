package t.com.apihug.sample.wire.domain.student.repository;

import com.apihug.sample.wire.domain.student.repository.StudentEntityRepository;

/**
 * NEVER try to use this class directly, keep it as an interface(default, no public), all body of this interface will be merger to {@link StudentEntityRepository} after {@code stub }; 
 *
 *
 * NEVER try to Overwrite parent  {@link StudentEntityRepository }   or {@link org.springframework.data.repository.ListCrudRepository} 's default method!!
 *
 * @see StudentEntityRepository
 *
 * @see com.apihug.sample.wire.domain.student.StudentEntity
 */
interface _StudentEntityRepository extends StudentEntityRepository {
  /**
   * Please put your customized SQL here,  any SQL other place will be dropped after merger!
   */
  interface _DerivedSQL {
  }
}
