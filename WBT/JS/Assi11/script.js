function getWeekDay(date) {
    switch (date.getDay()) {
        case 0: return 'Sun'
        case 1: return 'Mon'
        case 2: return 'Tue'
        case 3: return 'Wed'
        case 4: return 'Thu'
        case 5: return 'Fri'
        case 6: return 'Sat'
    }
}

let date = new Date(2012, 5, 3);
document.write( getWeekDay(date) );