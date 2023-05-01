package Punto3;

import java.util.Date;

public class Alumno extends Person {

  private int id;
  private double gpa;
  private String carrera;
  private String titulo;
  private int añoGraduacion;

  public Alumno(String firstName, String middleName, String lastName, Date dateOfBirth, int id, String carrera, String titulo, int añoGraduacion) {
    super(firstName, middleName, lastName, dateOfBirth);
    this.id = id;
    this.carrera = carrera;
    this.titulo = titulo;
    this.añoGraduacion = añoGraduacion;
  }

  public int getId() {
    return id;
  }

  public double getGpa() {
    return gpa;
  }

  public String getCarrera() {
    return carrera;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getañoGraduacion() {
    return añoGraduacion;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public double calculateGpa(String[] grades) {
    double[] gradePoints = {4.0, 3.67, 3.33, 3.0, 2.67, 2.33, 2.0, 1.0, 0.0};
    double sum = 0.0;
    for (String grade : grades) {
      switch (grade) {
        case "A":
          sum += gradePoints[0];
          break;
        case "A-":
          sum += gradePoints[1];
          break;
        case "B+":
          sum += gradePoints[2];
          break;
        case "B":
          sum += gradePoints[3];
          break;
        case "B-":
          sum += gradePoints[4];
          break;
        case "C+":
          sum += gradePoints[5];
          break;
        case "C":
          sum += gradePoints[6];
          break;
        case "D":
          sum += gradePoints[7];
          break;
        case "F":
          sum += gradePoints[8];
          break;
        default:
          break;
      }
    }
    gpa = sum / grades.length;
    return gpa;
  }

}
