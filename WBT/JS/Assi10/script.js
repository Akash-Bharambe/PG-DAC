let now = new Date()

function getday() {
    switch (now.getDay()) {
        case 0: return 'Sunday'
        case 1: return 'Monday'
        case 2: return 'Tuesday'
        case 3: return 'Wednesday'
        case 4: return 'Thursday'
        case 5: return 'Friday'
        case 6: return 'Saturday'
    }
}

function getmonth() {
    switch (now.getMonth()) {
        case 0: return 'January';
        case 1: return 'February';
        case 2: return 'March';
        case 3: return 'April';
        case 4: return 'May';
        case 5: return 'June';
        case 6: return 'July';
        case 7: return 'August';
        case 8: return 'September';
        case 9: return 'October';
        case 10: return 'November';
        case 11: return 'December';
    }
}

function getNoon() {
    let hours = now.getHours();
    if (hours >= 20 || hours < 5) return 'Good Night';
    else if (hours >= 5 && hours < 12) return 'Good Morning';
    else if (hours >= 12 && hours < 17) return 'Good Afternoon';
    else return 'Good Evening';
}

function getDaysLeft() {
    let endOfYear = new Date(now.getFullYear(),11,31)
    return Math.round((endOfYear.getTime() - now.getTime()) / (1000*3600*24))
}
document.getElementById('out').innerHTML = `<p>Today is ${getday()}, ${now.getDate()} ${getmonth()} ${now.getYear()}, Welcome, and ${getNoon()} to You.</p><p>Number of Days left till end of Year: ${getDaysLeft()} </p>`