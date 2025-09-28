from library import Library

class Book(Library):
    def __init__(self, name, date, section , bowring = False , returning = True, checking_available = True):
        super().__init__(name, bowring, returning, checking_available, date)
        self.section = section
    def late_fee(self, date):
        print(f"fee = {10*date}$")
    def overdue_notification(self, date):
        if(date == self.date):
            print(f"the Book {self.name} date is over")