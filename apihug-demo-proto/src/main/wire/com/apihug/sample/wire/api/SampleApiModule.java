package com.apihug.sample.wire.api;

import hope.common.meta.artifact.Artifact;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectAuthority;
import hope.common.meta.project.ProjectPersistence;
import hope.common.meta.project.ProjectStatus;
import hope.common.service.Module;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public class SampleApiModule implements Module<SampleApiCollector> {
  protected final Project project;

  protected final SampleApiCollector api;

  public SampleApiModule() {
    project =  new Project();
    api =  new SampleApiCollector();
    project.setName("apihug-demo-proto");
    project.setDescription("API definition of Demo project for apihug");
    project.setDomain("sample");
    project.setPackageName("com.apihug.sample");
    project.setApplication("apihug-demo");
    project.setIdentifier("apihug-demo-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("apihug-demo-proto");
    artifact.setGroupId("com.apihug");
    artifact.setVersion("0.1.1-SNAPSHOT");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2024-06-14");
    status.setCreatedBy("admin");
    ProjectAuthority authority = new ProjectAuthority();
    project.setAuthority(authority);
    authority.setEnumClass("com.apihug.sample.wire.infra.settings.DemoAuthorityEnum");
    authority.setCodePrefix(10240000L);
    ProjectPersistence persistence = new ProjectPersistence();
    project.setPersistence(persistence);
    persistence.setIdentifyType(ProjectPersistence.Type.LONG);
    persistence.setTenantType(ProjectPersistence.Type.LONG);
    persistence.setFormat(ProjectPersistence.Format.DEFAULT);
    persistence.setUpper(ProjectPersistence.Upper.DEFAULT);
  }

  @Override
  public Project project() {
    return project;
  }

  @Override
  public SampleApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.1.1-SNAPSHOT";
  }
}
