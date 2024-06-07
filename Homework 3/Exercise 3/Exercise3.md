# Exercise 3

1. TC 1: grade1: 1.0, grade2: 3.5, grade3: 0.0, return: -, exception: NoSuchGradeException
2. TC 2: grade1: 3.7, grade2: 1.7, grade3: 0.0, return: -, exception: ThirdExaminerNeededException
3. TC 3: grade1: 1.7, grade2: 4.0, grade3: 2.3, return 2.0, exception: -
4. TC 4: grade1: 1.0, grade2: 2.0, grade3: 5.0, return: 1.5, exception: -


Note: The test cases only view cases where the students get passed. The case where student fail the thesis, e.g.,
TC 5: grade1: 1.0, grade2: 5.0, grade3: 5.0, returns 3.0
is lacking in the specification. It needs a dedicated exception class, as the student failed the thesis and do not pass with a 3.0, as returned by the method.