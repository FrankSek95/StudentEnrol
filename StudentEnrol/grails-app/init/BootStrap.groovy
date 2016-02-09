import com.studentenrol.*

class BootStrap{

    def init = { servletContext ->

	def course1=new Course( title: 'Interactive Media with Animation',
				department: 'Computing',
				description: '''Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
				leader: 'Joe Jojo',
				code: 'IMA101',
				startDate: new Date('19/01/2015'),
				endDate: new Date('19/01/2020')).save()

def course2=new Course( title: 'Databases',
				department: 'Computing',
				description: '''SQL databases + Oracle''',
				leader: 'Will Smith',
				code: 'D101',
				startDate: new Date('19/01/2015'),
				endDate: new Date('19/01/2020')).save()

def course3=new Course( title: 'PCP',
				department: 'Computing',
				description: '''Employability''',
				leader: 'Shabaz Khalid',
				code: 'PCP101',
				startDate: new Date('19/01/2015'),
				endDate: new Date('19/01/2020')).save()




def student1=new Student( name: 'Shabaz Khalid',
			studentid: 'b4010311',
			dob: ('15/02/1996'),
			email: 'Shabaz.Khalid@shu.ac.uk',
			username: 'S.Khalid',
			password: 'password',
			course: 'Computing').save()

def student2=new Student( name: 'Frank Sekyere',
			studentid: 'b4019796',
			dob: ('19/04/1995'),
			email: 'Frank.Sekyere@shu.ac.uk',
			username: 'F.Sekyere',
			password: 'Frank09',
			course: 'Computing').save()

def lecturer1=new Lecturer( name: 'Tonderai Maswera',
			post: 'N/a',
			email: 't.maswera@shu.ac.uk',
			department: 'Computing',
			subject: 'Web Architectures',
			research: 'N/A').save()

def lecturer2=new Lecturer( name: 'Lynn Dawson',
			post: 'N/a',
			email: 'l.Dawson@shu.ac.uk',
			department: 'Computing',
			subject: 'IT Service Delivery',
			research: 'N/A').save()



    }
    def destroy = {
    }
}
