from library import Library

class DVD(Library):
    def __init__(self, name, date, duration, bowring = False , returning = True, checking_available = True):
        super().__init__(name, bowring, returning, checking_available, date)
        self.duration = duration
    def late_fee(self, date):
        print(f"fee = {3*date}$")
    def overdue_notification(self, date):
        if(date == self.date):
            print(f"the DVD {self.name} date is over")