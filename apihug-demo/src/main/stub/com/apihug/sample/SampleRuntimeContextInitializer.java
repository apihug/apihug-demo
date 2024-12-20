package com.apihug.sample;

import com.apihug.sample.wire.api.SampleApiModule;
import hope.common.Builder;
import hope.common.meta.artifact.Artifact;
import hope.common.meta.cloud.Dependency;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectStub;
import hope.common.runtime.RuntimeContext;
import hope.common.spring.RuntimeContextInitializer;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class SampleRuntimeContextInitializer extends RuntimeContextInitializer {
  @Override
  protected void init() {
    RuntimeContext runTimeCtx = RuntimeContext.INSTANCE;
    runTimeCtx.setDomain("sample");
    runTimeCtx.setProto(new SampleApiModule().project());
    runTimeCtx.setProject(new Builder<Project>() {
      @Override
      public Project build() {
        Project res  = new Project();
        res.setName("apihug-demo");
        res.setDescription("Demo project for apihug");
        res.setPackageName("com.apihug.sample");
        res.setArtifact(new Builder<Artifact>() {
          @Override
          public Artifact build() {
            Artifact res  = new Artifact();
            res.setGroupId("com.apihug");
            res.setArtifactId("apihug-demo");
            res.setVersion("0.1.1-SNAPSHOT");
            return res;
          }
        }.build());
        ProjectStub stub  = new ProjectStub();
        Dependency dependency  = new Dependency();
        stub.setProto(dependency);
        dependency.setArtifact(new Builder<Artifact>() {
          @Override
          public Artifact build() {
            Artifact res  = new Artifact();
            res.setGroupId("com.apihug");
            res.setArtifactId("apihug-demo-proto");
            res.setVersion("0.1.1-SNAPSHOT");
            return res;
          }
        }.build());
        res.setStub(stub);
        return res;
      }
    }.build());
    runTimeCtx.setStubBuildTime("2024-11-29 15:16:31");
  }
}
