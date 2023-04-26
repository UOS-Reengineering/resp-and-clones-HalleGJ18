# Redistributing Responsibilities | Managing Code Clones

This repository includes lab materials to support the Spring Semester of the COM3523/6523 module "Software Reengineering" at the University of Sheffield.

In this week, we explore "redistributing responsibilities" and "managing code clones".


## Important Notes

Below we have a list of tasks you need to complete.
Although the tasks are independent, you may find it useful to complete them in the order listed below.

Note that several instructions and hints are given in the code files.
Please best use them and think carefully about the code before you start to write your own code.

By default, a CI/CD pipeline is set up to automatically check the following commands 
(i.e., the commands that must pass when you complete all the tasks below) 
when your commits are pushed to the main branch:
- `mvn test -Dtest=TestExtractMethods`
- `mvn test -Dtest=TestDelegateMethods`
- `mvn test -Dtest=TestBank#testBank_new`
- `mvn test -Dtest=TestJaccardSimilarity`
- `mvn test -Dtest=TestDotPlot`


## Part 0: Setup

This part is to set up your own repository and understand the code in the repository.

### Step 1: Clone your repository
First, clone this repository to your local machine 
(e.g., the user drive in the University computer; `u:/Teaching/COM3523/2022-23` in my case). 
Open `Git Bash` and enter the following commands:

```bash
cd u:/Teaching/COM3523/2022-23
git clone [YOUR_REPOSITORY_ADDRESS]
```

### Step 2: Take a look at the code
Now, take a look at the code you just cloned.
If you want, open the project in IntelliJ and browse the files in it.
For those who wants to install IntelliJ 2022 on your shared drive (/U:), 
please refer to [this guideline](/resources/install-intellij-user-drive.md).


## Part 1: Redistributing Responsibilities

This part is about redistributing responsibilities.
Please see "Week 8 - lecture materials" on the Blackboard for more information.

### (Task1) Extract methods

Please read instructions and complete [ExtractMethods.java](src/main/java/example/project/Refactoring/ExtractMethods.java).

If you complete this, the following test case should pass:
```bash
mvn test -Dtest=TestExtractMethods
```

### (Task2) Delegate methods

Please read instructions and complete [DelegateMethods.java](src/main/java/example/project/Refactoring/DelegateMethods.java).

If you complete this, the following test case should pass:
```bash
mvn test -Dtest=TestDelegateMethods
```

### (Task3) Deal with god classes

Please read instructions and complete [Bank.java](src/main/java/example/project/GodClassExample/Bank.java).

If you complete this, the following test case should pass:
```bash
mvn test -Dtest=TestBank#testBank_new
```


## Part 2: Managing Code Clones

This part is about managing code clones.
Please see "Week 9 - lecture materials" on the Blackboard for more information.

### (Task4) Compute Jaccard similarity

Please read instructions and complete [JaccardSimilarity.java](src/main/java/example/project/CodeClones/JaccardSimilarity.java).

If you complete this, the following test case should pass:
```bash
mvn test -Dtest=TestJaccardSimilarity
```

### (Task5) Draw dot plots

Please read instructions and complete [DotPlot.java](src/main/java/example/project/CodeClones/DotPlot.java).

If you complete this, the following test case should pass:
```bash
mvn test -Dtest=TestDotPlot
```

### References
- [Week 8 (Redistributing Responsibilities) - lecture materials](https://learn-eu-central-1-prod-fleet01-xythos.content.blackboardcdn.com/5c8f80ee07c44/31495433?X-Blackboard-S3-Bucket=learn-eu-central-1-prod-fleet01-xythos&X-Blackboard-Expiration=1682456400000&X-Blackboard-Signature=x0KqNZEXQk1XeK7r95mJJRdi0TvfMJkmJg0gsg7MdQY%3D&X-Blackboard-Client-Id=309431&X-Blackboard-S3-Region=eu-central-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%278_Responsibilities.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEA8aDGV1LWNlbnRyYWwtMSJIMEYCIQD8mv6y3qMiWG9R6Mgx%2FcSul3GjkD8UByjaSb2QVNfTcAIhAMz5ME64rHORY72leMJIK%2FFSFO8yRDZ4aCHepH8ZFrFYKr4FCBgQAxoMNjM1NTY3OTI0MTgzIgxXea9gRhhp9Xf0SLwqmwXGZj1Bk99L0mXWobOiXYAT2uNTu6RM%2FOkM5ftRvrC9%2FODiWwPK%2BT2V0h9S3xRNWTfda5ax4AFmjbP2X6ls%2B%2FDGKG5gvfLmOcRSl0%2BR6B9ZhEQFJ3LWO%2FeIZrQXE%2BoNNYbddEAH7ImJtU9nKQ6fJQXElvhi4GoHxXJlDCkkaKzOHmXdQ7NUGqaVkasUgCioBy%2F8OxvHTNouPFc6BP42PvfjWsalX2IvWEK5b9RL4umI3SPlaVBQh8cMeL%2FA9TiA0kpt%2FEQybMD6Xotgbj%2B9NLZCtGWASDZASnE9bujEnKO%2B9HOX01cqeRdYROao%2BPpFVfQ4i5%2BEz%2BxPtv0WWqGyh8YRxHvASl9wvsnEB9QMZrcjn58Pg%2FVrVX1QwplUteLdc%2ByaE6e1aH3YKj2MXF9YwWMG3AFfQjWeJrASnqIlJZOMTESUCKrZ5%2FXMb%2FpqOc3KCbjHAfGenlzfTYhceN6%2BKclKAvidkB5FzROp%2B%2BIMAXZn5w54OvaYFyKcQxdPmDHw7dIS%2B5lmGx5KMUgfmx%2BI4xnQSx3oCRXmNvmSrlFvApgyMzeS7hLOQdowoSK0qfQ8cdTRuYxnfF4uUEM2lYQkDE%2BlRtsQbW4OVLuoDQIcTCut%2B5rtOaRFqbMAh61R4mnUeCDUgGSBW9HM7XUIgJ7643Lsq%2BkWJITMU8X3tWnM39jDxUUpf7hFEtPJ4BUvmit0EE6pMamqxeo4hacIgY%2FTebfj90bSQWD7n9zIzJXTUHhFadw22gw3p4SKObzwv%2B6Zx9wGwMBQF6RIx%2BXC%2B%2BJxPR%2FDtHckBR4e175VsPMoB8NIMIcza3k6fe1DHytxc%2BdCdZt2xANRvtitAnZtBrkb9rl6HejsWEDT2NTbhAl8bGMbdbCFU%2BnxiGOJflyKMLDJn6IGOrAB9LXSYdnpwCpyNvKYcycxYxfOocSvz4VwVSx78hriAdVAV5gYLKyv5QNdrDH8dU%2Bz%2FxZmWhammfW%2FzLsxUaErijnGHQmuM9qfWpKhxGac4TTxQD%2BgJQj%2F92yZdy8P4DviRFXOjMJWhISFzFbBlgV0RiNM%2FqTWpKDPDhY8ohgQNp84b%2BMe3IHSVVWuKvF%2F0hZqnZaoI9Q0xDCkFrXbeDdyDm2G2ZwGd3vJ8hBZVcXmCPI%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230425T150000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAZH6WM4PLUPY6XSI3%2F20230425%2Feu-central-1%2Fs3%2Faws4_request&X-Amz-Signature=6b1bb3406a936f50f68b1ebd3f7f11111208c4c4bf8f73e064289326cc61340b) (TUOS login required)
- [Week 9 (Managing Code Clones) - lecture materials](https://learn-eu-central-1-prod-fleet01-xythos.content.blackboardcdn.com/5c8f80ee07c44/32208494?X-Blackboard-S3-Bucket=learn-eu-central-1-prod-fleet01-xythos&X-Blackboard-Expiration=1682456400000&X-Blackboard-Signature=1vlu97MTyY%2BKGkf1se6wCwU2jNAy1Kp4LXZTY88hv7c%3D&X-Blackboard-Client-Id=309431&X-Blackboard-S3-Region=eu-central-1&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%279_code-clones%25281%2529.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEA8aDGV1LWNlbnRyYWwtMSJIMEYCIQD8mv6y3qMiWG9R6Mgx%2FcSul3GjkD8UByjaSb2QVNfTcAIhAMz5ME64rHORY72leMJIK%2FFSFO8yRDZ4aCHepH8ZFrFYKr4FCBgQAxoMNjM1NTY3OTI0MTgzIgxXea9gRhhp9Xf0SLwqmwXGZj1Bk99L0mXWobOiXYAT2uNTu6RM%2FOkM5ftRvrC9%2FODiWwPK%2BT2V0h9S3xRNWTfda5ax4AFmjbP2X6ls%2B%2FDGKG5gvfLmOcRSl0%2BR6B9ZhEQFJ3LWO%2FeIZrQXE%2BoNNYbddEAH7ImJtU9nKQ6fJQXElvhi4GoHxXJlDCkkaKzOHmXdQ7NUGqaVkasUgCioBy%2F8OxvHTNouPFc6BP42PvfjWsalX2IvWEK5b9RL4umI3SPlaVBQh8cMeL%2FA9TiA0kpt%2FEQybMD6Xotgbj%2B9NLZCtGWASDZASnE9bujEnKO%2B9HOX01cqeRdYROao%2BPpFVfQ4i5%2BEz%2BxPtv0WWqGyh8YRxHvASl9wvsnEB9QMZrcjn58Pg%2FVrVX1QwplUteLdc%2ByaE6e1aH3YKj2MXF9YwWMG3AFfQjWeJrASnqIlJZOMTESUCKrZ5%2FXMb%2FpqOc3KCbjHAfGenlzfTYhceN6%2BKclKAvidkB5FzROp%2B%2BIMAXZn5w54OvaYFyKcQxdPmDHw7dIS%2B5lmGx5KMUgfmx%2BI4xnQSx3oCRXmNvmSrlFvApgyMzeS7hLOQdowoSK0qfQ8cdTRuYxnfF4uUEM2lYQkDE%2BlRtsQbW4OVLuoDQIcTCut%2B5rtOaRFqbMAh61R4mnUeCDUgGSBW9HM7XUIgJ7643Lsq%2BkWJITMU8X3tWnM39jDxUUpf7hFEtPJ4BUvmit0EE6pMamqxeo4hacIgY%2FTebfj90bSQWD7n9zIzJXTUHhFadw22gw3p4SKObzwv%2B6Zx9wGwMBQF6RIx%2BXC%2B%2BJxPR%2FDtHckBR4e175VsPMoB8NIMIcza3k6fe1DHytxc%2BdCdZt2xANRvtitAnZtBrkb9rl6HejsWEDT2NTbhAl8bGMbdbCFU%2BnxiGOJflyKMLDJn6IGOrAB9LXSYdnpwCpyNvKYcycxYxfOocSvz4VwVSx78hriAdVAV5gYLKyv5QNdrDH8dU%2Bz%2FxZmWhammfW%2FzLsxUaErijnGHQmuM9qfWpKhxGac4TTxQD%2BgJQj%2F92yZdy8P4DviRFXOjMJWhISFzFbBlgV0RiNM%2FqTWpKDPDhY8ohgQNp84b%2BMe3IHSVVWuKvF%2F0hZqnZaoI9Q0xDCkFrXbeDdyDm2G2ZwGd3vJ8hBZVcXmCPI%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230425T150000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAZH6WM4PLUPY6XSI3%2F20230425%2Feu-central-1%2Fs3%2Faws4_request&X-Amz-Signature=7e5f6bed714b03e9d2ccddce3ef8fa13bde7765bb7fe3acbbe42530e8d016d96) (TUOS login required)
