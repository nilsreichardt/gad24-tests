# GAD 24 - Tests

This is a repository to collect JUnit Tests for GAD exercises at TUM in SoSe24. These tests have been written by students for students and are not part of the official course.

## Legal Status

> Es ist alles erlaubt, was die Lösung nicht verrät.

The so-called *Übungsleitung* will have an eye on this repository. But as long as the tests do not reveal the solution of the homework, this repository will tolerate them. To ensure the solution is not getting revealed, the tests should be Input/Output-Tests only.

Furthermore, there is no guarantee of the correctness of the tests. Neither the *Übungsleitung* nor any of the other tutors will contribute own tests. It is your own responsibility to validate the correctness and if necessary report bugs or even provide/contribute a fix for your fellow student.

### Examples

**correct**:
```java
// Test Area calculation
// Arrange
Rectangle r1 = new Rectangle(length: 4, width: 4)
// Act & Assert
assertEquals(16, r1.calculateArea());
```

**wrong!**:
```java
// Test Area calculation
// Arrange
Rectangle r1 = new Rectangle(length: 4, width: 6)
// Act & Assert
// Calculate using length * width             // <-- reveals the solution
assertEquals(4*6, r1.calculateArea()); // <-- reveals the solution
```

## Usage

https://github.com/nilsreichardt/gad24-tests/assets/24459435/6d3126b4-487d-4e40-bdc9-3b15a01170d7

1. Clone this repository
    ```shell
    git clone https://github.com/nilsreichardt/gad24-tests.git
    ```

2. Check for updates
    ```shell
    git pull
    ```

3. Copy the `test` directory to the root of your repository (next to `src`) and *not* inside your src folder
    ```
    ./your-gad-project
    ├───src
    ├───test
    └───...
    ```
    Or use the symlink instruction below.

4. Make sure in the `build.gradle` file `sourceSets`, `test` and `dependencies` look somewhat like that:
    ```groovy
    sourceSets {
        main {
            java {
                srcDir 'src'
            }
        }
        test {
            java {
                srcDirs = ['test']
            }
        }
    }

    test {
        useJUnitPlatform()
    }

    dependencies {
        testImplementation('org.junit.jupiter:junit-jupiter:5.9.0')
    }
    ```

5. Open the gradle tool window
6. Click reload
7. Run the tests via `tasks -> verification -> test` and check your mistakes

### Important note
As this is a student-driven project please keep in mind that mistakes can happen. If you think a test is wrong, please feel free to open an Issue:
[Open Issue](https://github.com/nilsreichardt/gad24-tests/issues)

### How to use symlinks (Advanced Users only)
**Windows:**
This has to be executed in the command line, run as administrator:
```shell
mklink /d \path\to\artemis-repository\test\gad \path\to\test-repository\aufgabe\test\gad
```

**Linux/MacOS:**
```shell
ln -s /path/to/test-repository/aufgabe/test/gad /path/to/artemis-repository/test/gad
```

## How to Contribute

1. Read our guidelines in our [CONTRIBUTING.md](https://github.com/nilsreichardt/gad24-tests/blob/main/CONTRIBUTING.md)
2. Fork Repository ([GitHub Documentation](https://docs.github.com/en/get-started/quickstart/fork-a-repo#forking-a-repository))
3. Add / edit tests under `<EXERCISE>/test/`
4. Ensure no solution or homework-code is getting revealed
5. Commit and push to your fork repository
6. Open a Pull Request to this repository ([GitHub Documentation](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests))
7. Wait until another student reviewed the PR

## Contributors
![Contributors](https://contrib.rocks/image?repo=nilsreichardt/gad24-tests)

## Helpful Links

- [PGDP WS 22/23 Tests](https://github.com/MaximilianAnzinger/pgdp2223-tests)
- [GAD SS23 Tests](https://github.com/JohannesStoehr/gad23-tests)
- [GAD SS22 Tests](https://github.com/MaximilianAnzinger/gad2022-tests)
- [Writing Tests using JUnit 5](https://junit.org/junit5/docs/current/user-guide/#writing-tests)
- [Learning Git with Bitbucket](https://www.atlassian.com/de/git/tutorials/learn-git-with-bitbucket-cloud)
- [Getting Started with GitHub](https://docs.github.com/en/get-started/quickstart/hello-world)

![Made with ersti tears](https://img.shields.io/badge/made%20with-tears-blue?style=svg)
