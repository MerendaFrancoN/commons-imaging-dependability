<!---
 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
-->
<!---
 +======================================================================+
 |****                                                              ****|
 |****      THIS FILE IS GENERATED BY THE COMMONS BUILD PLUGIN      ****|
 |****                    DO NOT EDIT DIRECTLY                      ****|
 |****                                                              ****|
 +======================================================================+
 | TEMPLATE FILE: readme-md-template.md                                 |
 | commons-build-plugin/trunk/src/main/resources/commons-xdoc-templates |
 +======================================================================+
 |                                                                      |
 | 1) Re-generate using: mvn commons-build:readme-md                    |
 |                                                                      |
 | 2) Set the following properties in the component's pom:              |
 |    - commons.componentid (required, alphabetic, lower case)          |
 |    - commons.release.version (required)                              |
 |                                                                      |
 | 3) Example Properties                                                |
 |                                                                      |
 |  <properties>                                                        |
 |    <commons.componentid>math</commons.componentid>                   |
 |    <commons.release.version>1.2</commons.release.version>            |
 |  </properties>                                                       |
 |                                                                      |
 +======================================================================+
--->
Apache Commons Imaging
===================

[![Java CI](https://github.com/apache/commons-imaging/actions/workflows/maven.yml/badge.svg)](https://github.com/apache/commons-imaging/actions/workflows/maven.yml)
[![Coverage Status](https://codecov.io/gh/apache/commons-imaging/branch/master/graph/badge.svg)](https://app.codecov.io/gh/apache/commons-imaging/branch/master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.commons/commons-imaging/badge.svg?gav=true)](https://maven-badges.herokuapp.com/maven-central/org.apache.commons/commons-imaging/?gav=true)
[![Javadocs](https://javadoc.io/badge/org.apache.commons/commons-imaging/1.0-alpha3.svg)](https://javadoc.io/doc/org.apache.commons/commons-imaging/1.0-alpha3)
[![Fuzzing Status](https://oss-fuzz-build-logs.storage.googleapis.com/badges/apache-commons.svg)](https://bugs.chromium.org/p/oss-fuzz/issues/list?sort=-opened&can=1&q=proj:apache-commons)
[![CodeQL](https://github.com/apache/commons-imaging/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/apache/commons-imaging/actions/workflows/codeql-analysis.yml)
[![OpenSSF Scorecard](https://api.securityscorecards.dev/projects/github.com/apache/commons-imaging/badge)](https://api.securityscorecards.dev/projects/github.com/apache/commons-imaging)

Apache Commons Imaging (previously Sanselan) is a pure-Java image library.

Documentation
-------------

More information can be found on the [Apache Commons Imaging homepage](https://commons.apache.org/proper/commons-imaging).
The [Javadoc](https://commons.apache.org/proper/commons-imaging/apidocs) can be browsed.
Questions related to the usage of Apache Commons Imaging should be posted to the [user mailing list][ml].

Where can I get the latest release?
-----------------------------------
You can download source and binaries from our [download page](https://commons.apache.org/proper/commons-imaging/download_imaging.cgi).

Alternatively, you can pull it from the central Maven repositories:

```xml
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-imaging</artifactId>
  <version>1.0-alpha3</version>
</dependency>
```

Contributing
------------

We accept Pull Requests via GitHub. The [developer mailing list][ml] is the main channel of communication for contributors.
There are some guidelines which will make applying PRs easier for us:
+ No tabs! Please use spaces for indentation.
+ Respect the code style.
+ Create minimal diffs - disable on save actions like reformat source code or organize imports. If you feel the source code should be reformatted create a separate PR for this change.
+ Provide JUnit tests for your changes and make sure your changes don't break any existing tests by running ```mvn```.

If you plan to contribute on a regular basis, please consider filing a [contributor license agreement](https://www.apache.org/licenses/#clas).
You can learn more about contributing via GitHub in our [contribution guidelines](CONTRIBUTING.md).

License
-------
This code is under the [Apache License v2](https://www.apache.org/licenses/LICENSE-2.0).

See the `NOTICE.txt` file for required notices and attributions.

Donations
---------
You like Apache Commons Imaging? Then [donate back to the ASF](https://www.apache.org/foundation/contributing.html) to support the development.

Additional Resources
--------------------

+ [Apache Commons Homepage](https://commons.apache.org/)
+ [Apache Issue Tracker (JIRA)](https://issues.apache.org/jira/browse/IMAGING)
+ [Apache Commons Twitter Account](https://twitter.com/ApacheCommons)
+ `#apache-commons` IRC channel on `irc.freenode.org`

[ml]:https://commons.apache.org/mail-lists.html


# Software Dependability Tools - Usage

## 1. SonarCloud
- Link to access data: https://sonarcloud.io/project/overview?id=MerendaFrancoN_commons-imaging-dependability

## 2. Code Coverage Tools
### 1. Cobertura

### 2. JaCoCo
- Run  Jacoco Code Coverage Report:
  - `mvn clean test jacoco:report`

- **Check** -> Output Folder: `target/site/jacoco`
  - -> Output Report in HTML: `target/site/jacoco/index.html`
  - -> Output Report in CSV: `target/site/jacoco/index.html`

### 3. [CodeCov](https://about.codecov.io/)
- Link to access data: https://app.codecov.io/gh/MerendaFrancoN/commons-imaging-dependability
  - Data is uploaded when a commit is pushed to `master` or for each PR.

## 3. Mutation Testing Tool
### 1. [PiTest](https://pitest.org/quickstart/maven/) 
1. Run Mutation Coverage and generate report in html: 
 - **Run**: `mvn org.pitest:pitest-maven:mutationCoverage -DoutputFormats=HTML`
 - **Check**: `target/pit-reports/index.html`
2. Run Mutation Coverage with specific mutation operator:mvn org.pitest:pitest-maven:mutationCoverage -DmutationOperators=YOUR_CUSTOM_OPERATOR
   - Syntax: `mvn org.pitest:pitest-maven:mutationCoverage -DmutationOperators=YOUR_CUSTOM_OPERATOR`
   - Example: `mvn org.pitest:pitest-maven:mutationCoverage -Dmutators=ALL` - Tries with all mutation operators.

## 4. Benchmarking Tools
#### 1. Java Microbenchmarking Tool (JMH)
--> Usage info - https://www.baeldung.com/java-microbenchmark-harness

1. Mark all the tests that you could need to benchmark using Java Microbenchmark annotations.
2. Run `src/test/java/org/apache/commons/imaging/BenchmarkRunner.java` - `Main` function to run benchmarks.


## 5. Automated Testing Generation Tools
### 1. [EvoSuite](https://www.evosuite.org/) - Use Java 8
- EvoSuite Tests Generation for all classes - Only Runs with **`Java 8`** !
- Use the following flag: -DrunEvosuite=true -- `false` for disable it and `true` for enable it. 
- Syntax:
  - `mvn -DmemoryInMB=<amount_mb> -Dcores=<number_of_cores> evosuite:generate evosuite:export test -DrunEvosuite=true`
- Example: 
  - `mvn -DmemoryInMB=8000 -Dcores=6 evosuite:generate evosuite:export test -DrunEvosuite=true`


- EvoSuite Tests Generation for specific classes - Only Runs with **`Java 8`** !
  - Syntax: `mvn -DmemoryInMB=<amount_mb> -Dcores=<number_of_cores> evosuite:generate evosuite:export test -DcutsFile=<path_to_file_where_specific_classes_are_defined.txt>`
- Example:
  - `mvn -DmemoryInMB=2000 -Dcores=2 evosuite:generate evosuite:export test -DcutsFile=.evosuite/cutsFile.txt -DrunEvosuite=true`

Example of `cutsFile.txt`:

`org.apache.commons.imaging.ImageInfo, org.apache.commons.imaging.ImageFormats`

### 2. [Randoop](https://randoop.github.io/randoop/) - Use Java 8 
1. Download last version [jar](https://randoop.github.io/randoop/manual/index.html#getting_randoop)
2. Example for generating tests with randoop : 
```bash 
java -Xmx3000m -classpath /Users/stormtrooper/SoftwareProjects/commons-imaging/target/commons-imaging-1.0-SNAPSHOT.jar:/Users/stormtrooper/Downloads/randoop-4.3.2/randoop-all-4.3.2.jar randoop.main.Main gentests --testclass=org.apache.commons.imaging.ImageInfo --output-limit=10
```

More on: [Randoop - Getting Started](https://randoop.github.io/randoop/manual/index.html#getting_randoop)

## Security - Related Tools
### 1. [SpotBug](https://spotbugs.github.io/)
1. Run -> `mvn spotbugs:check`
2. Run -> `mvn spotbugs:gui` - To run a graphical ui to see the report graphically.

--> It's also configured as an action in the CI, you can see it in the github actions as well.

### 2. [Owasp DC](https://owasp.org/www-project-dependency-check/)
1. Run -> `mvn org.owasp:dependency-check-maven:check`
2. Check the report in `target/dependency-check-report.html`