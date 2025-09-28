class Library:
    def __init__(self, name, date, bowring = False , returning = True, checking_available = True):
        self.name = name
        self.bowring = bowring
        self.returning = returning
        self.checking_available = checking_available
        self.date = date
    
    def borrowing_items(self, date):
        self.bowring = True
        self.returning = False
        self.checking_available = False
        self.date = date
        print(f"the {self.name} is bowring")
    
    def returning_item(self):
        self.bowring = False
        self.returning = True
        self.checking_available = True
        print(f"the {self.name} is returned")
        
    def is_available(self):
        return self.checking_available
    
    def late_fee(self, date):
        print(f"fee = {10*date}$")
    
    def overdue_notification(self, date):
        if(date == self.date):
            print(f"the book {self.name} date is over")
