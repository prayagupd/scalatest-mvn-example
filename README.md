#running scalatests with maven


add following three plugins to your maven config file, 

```

            <plugin>
                <groupId>net.alchim31.maven</groupId>
                <artifactId>scala-maven-plugin</artifactId>
                <version>3.2.2</version>
                <executions>
                    <execution>
                        <id>scala-compile-first</id>
                        <phase>process-resources</phase>
                        <goals>
                            <goal>add-source</goal>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>scala-test-compile</id>
                        <phase>process-test-resources</phase>
                        <goals>
                            <goal>testCompile</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>2.7</version>
					<configuration>
						<includes>
							<include>**/*Suite.class</include>
							<include>**/*Test.class</include>
							<include>**/*Tests.class</include>
							<include>**/*Spec.class</include>
							<include>**/*Specs.class</include>
						</includes>
					</configuration>
				</plugin>

				<plugin>
					<groupId>org.scalatest</groupId>
					<artifactId>scalatest-maven-plugin</artifactId>
					<version>1.0</version>
					<configuration>
						<reportsDirectory>${project.build.directory}/surefire-reports</reportsDirectory>
						<junitxml>.</junitxml>
						<filereports>TestSuite.txt</filereports>
					</configuration>
					<executions>
						<execution>
							<id>test</id>
							<goals>
								<goal>test</goal>
							</goals>
						</execution>
					</executions>
				</plugin>
```

