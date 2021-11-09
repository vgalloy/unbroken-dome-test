
Replace `url("VALID_URL")` in buildSrc/src/main/kotlin/vgalloy.unbroken-dome-conventions.gradle.kts

then run
`rm -rf */build/ && ./gradlew helmAddRepoRepository`

```shell
$ rm -rf */build/ && ./gradlew helmAddRepoRepository

> Task :project2:helmAddRepoRepository
"repo" has been added to your repositories

BUILD SUCCESSFUL in 2s
15 actionable tasks: 15 executed
```