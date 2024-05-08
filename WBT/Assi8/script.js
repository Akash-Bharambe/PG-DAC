const city = document.getElementById("city")

function changeList() {
    const selected = document.getElementById("location").value
        switch (selected) {
            case "United States of America":
                city.setAttribute("list", "USA")
                break;
            case "India":
                city.setAttribute("list", "IND")
            default:
                break;
        }
}