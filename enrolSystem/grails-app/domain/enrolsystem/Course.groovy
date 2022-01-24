package enrolsystem

class Course {

	String department
	String courseTitle
	String courseLeader
	String courseCode
	Date startDate
	Date endDate
	String description
	int numberOfStudents
	double tuitionFees
	String studyMode
 
    static constraints = {
	department blank: false, nullable: false
	courseTitle blank: false, nullable: false
	courseLeader blank: false, nullable: false
	courseCode blank: false, nullable: false
	startDate blank: false, nullable: false
	endDate blank: false, nullable: false
	description blank: false, nullable: false, maxSize: 5000
	numberOfStudents blank: false, nullable: false, minSize: 20, maxSize: 60
	tuitionFees blank: false, nullable: false, scale: 2
	studyMode blank: false, nullable: false, maxSize: 20

	
    }
}
