//Zach Weldon


double[] grades = {89.1, 80, 69.5, 99.8, 75, /* ... */, 69.7, 90};
char[] letterGrades = new char[grades.length];

for (int i = 0; i < grades.length; i++) {
    if (grades[i] >= 90) {
        letterGrades[i] = 'A';
    } else if (grades[i] >= 80) {
        letterGrades[i] = 'B';
    } else if (grades[i] >= 70) {
        letterGrades[i] = 'C';
    } else if (grades[i] >= 60) {
        letterGrades[i] = 'D';
    } else {
        letterGrades[i] = 'F';
    }
}
