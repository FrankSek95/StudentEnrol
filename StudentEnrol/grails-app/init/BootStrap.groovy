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

    }
    def destroy = {
    }
}
