import gspread

def export_data_to_google_sheets(data):
    # Create a Google Sheets client.
    client = gspread.Client()

    # Create a new spreadsheet.
    spreadsheet = client.create_spreadsheet("Salary Take-Home Estimates")

    # Write the data to the sheet.
    sheet = spreadsheet.get_sheet(0)
    sheet.append_row(data)

if __name__ == "__main__":
    # Get the data from the code.
    data = [
        ("CTC", "Monthly take-home salary"),
        ("2 LPA", "15,500 to 16,600"),
        ("3 LPA", "23,000 to 25,000"),
        ("3.5 LPA", "24,000 to 26,000"),
        ("4 LPA", "31,000 to 33,000"),
        ("4.5 LPA", "34,000 to 36,000"),
        ("5 LPA", "37,000 to 39,000"),
        ("5.5 LPA", "40,000 to 42,000"),
        ("6 LPA", "43,000 to 45,000"),
        ("6.5 LPA", "46,000 to 48,000"),
        ("7 LPA", "51,000 to 54,600"),
        ("7.5 LPA", "55,000 to 57,600"),
        ("8 LPA", "59,000 to 62,600"),
        ("8.5 LPA", "63,000 to 66,600"),
        ("9 LPA", "67,000 to 70,600"),
        ("9.5 LPA", "71,000 to 74,600"),
        ("10 LPA", "75,000 to 78,600"),
        ("10.5 LPA", "79,000 to 82,600"),
        ("11 LPA", "83,000 to 86,600"),
        ("11.5 LPA", "87,000 to 90,600"),
        ("12 LPA", "91,000 to 94,600"),
        ("12.5 LPA", "95,000 to 98,600"),
        ("13 LPA", "99,000 to 102,600"),
        ("13.5 LPA", "103,000 to 106,600"),
        ("14 LPA", "107,000 to 110,600"),
        ("14.5 LPA", "111,000 to 114,600"),
        ("15 LPA", "115,000 to 118,600"),
    ]

    export_data_to_google_sheets(data)