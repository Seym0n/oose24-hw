package hw3.a3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ThesisGradingTest {

    ThesisGrading thesisGrading;

    @BeforeEach
    void setUp() {
        this.thesisGrading = new ThesisGrading();
    }

    @BeforeEach
    void tearDown(){
        this.thesisGrading = null;
    }

    @Test
    void calculcateFinalGradeTestCase1() throws NoSuchGradeException, ThirdExaminerNeededException {
        double result = this.thesisGrading.calculcateFinalGrade(1.0, 2.0, 0);
        assertEquals(1.5, result);
    }

    @Test
    void calculcateFinalGradeTestCase2() {
        assertThrows(NoSuchGradeException.class, () -> {
            double result = this.thesisGrading.calculcateFinalGrade(1.0, 3.5, 0.0);
        });
    }

    @Test
    void calculcateFinalGradeTestCase3() {
        assertThrows(ThirdExaminerNeededException.class, () -> {
            double result = this.thesisGrading.calculcateFinalGrade(3.7, 1.7, 0.0);
        });
    }

    @Test
    void calculcateFinalGradeTestCase4() throws NoSuchGradeException, ThirdExaminerNeededException {
        double result = this.thesisGrading.calculcateFinalGrade(1.7, 4.0, 2.3);
        assertEquals(2.0, result);

    }

    @Test
    void calculcateFinalGradeTestCase5() throws NoSuchGradeException, ThirdExaminerNeededException {
        double result = this.thesisGrading.calculcateFinalGrade(1.0, 2.3, 5.0);
        assertEquals(1.65, result);

    }

}