package homeworkDay2;

public class Main {

	public static void main(String[] args) {
	
		Category category1=new Category();
		category1.buttonName = "Kurslar�m";
		
        Category category2=new Category();
		category2.buttonName = "T�m Kurslar";
		  
        Category category3=new Category();
		category3.buttonName = "Kampa Haz�rl�k";
		  
		Category category4=new Category();
		category4.buttonName = "S�k Sorulan Sorular"; 
		
		Category category5=new Category();
		category5.buttonName = "Hesap Ayarlar�";
				
				
      Category[] categories  = {category1,category2,category3,category4,category5};
		for (Category category: categories) {
			System.out.println(category.buttonName);
		}
		
		Instructor instructor = new Instructor();
		instructor.name= "Engin";
		instructor.surname="Demirog";
		
		
		
		Course course1= new Course();
		course1.name="C#";
		
		Course course2= new Course();
		course2.name="Java";
		
		Course course3= new Course();
		course3.name="Programlamaya Giri� i�in Temel Kurs";
		Course[] courses= {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		
		FindCourse findCourse = new FindCourse();
		findCourse.bFindCourse(course1);
		findCourse.bFindCourse(course2);
		findCourse.bFindCourse(course3);
		findCourse.WhichInstructor(instructor);
		
	}
	

}
