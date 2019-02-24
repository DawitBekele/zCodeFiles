package prob2A;

public class Student {
	String name;
  private GradeReport gradeReport;
  Student(String name){
	  gradeReport= new GradeReport(this);
	  this.name=name;
  }
  public GradeReport getGradeReport() {
	  return gradeReport;
  }
  
  public String getName() {
	  return this.name;
  }
  public String toString() {
	  return name + gradeReport;
			  
  }
}
