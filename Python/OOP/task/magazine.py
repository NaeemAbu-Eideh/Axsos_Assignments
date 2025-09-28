from library import Library

class Magazine(Library):
    def __init__(self, name, date, rate, bowring = False , returning = True, checking_available = True):
        super().__init__(name, bowring, returning, checking_available, date)
        self.rate = rate
    def late_fee(self, date):
        print(f"fee = {12*date}$")
    def overdue_notification(self, date):
        if(date == self.date):
            print(f"the Magazine {self.name} date is over")