# Exercise 3

## a)

_See code_

## b)

The outcome of student1 + student2 + student3 is a LearningGroup.

Hereby, a learning group is formed with the first addition, which is _student1 + student2_. The method \__\_add___ from Student is called with student1 as _self_ and student2 as _other_ parameter. The method returns the learning group which is used for the next addition.

In the next addition, we have the learningGroup + student3. Hereby, the method \__\_add___ is called from LearningGroup with the learning group itself as parameter _self_ and the student to be added student3 as _otherStudent_ parameter. The method returns a new learning group in which student1, student2 and student3 is part of it.