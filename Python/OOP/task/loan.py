from dvd import DVD
from book import Book
from magazine import Magazine


html_dvd = DVD("Html DVD Basics", "2019", "6H")
html_book = Book("Html Book Basic", "2015", "Programing Language")
html_magazine = Magazine("Html Book Basic", "2015", "9")


html_book.borrowing_items("3-6-2025")
html_dvd.borrowing_items("3-6-2025")
html_magazine.borrowing_items("3-6-2025")

html_book.returning_item()
print(f"Html Book available: {html_book.is_available()}")

print(f"Html DVD available: {html_dvd.is_available()}")

html_magazine.late_fee(5)
html_magazine.overdue_notification("3-6-2025")


