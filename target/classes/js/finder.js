function displayBikeParks(){
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        // Example handle logic
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-Type") === "application/json") {
                console.log("oh look its some JSON: " + req.responseText);

                let stuff = JSON.parse(req.response);
                stuff.forEach(parks => {

                    let elem = document.createElement('div');
                    let header = document.createElement('h1');
                    header.textContent = "Bike Park name: " + parks.name;
                    elem.appendChild(header);
                   // parks.trails.forEach(trail => {
                        console.log(parks) // print all notes for each notebook
                        let name = document.createElement('p');
                        let description = document.createElement('p');
                        let address = document.createElement('p');
                        name.textContent = "Trail Name: " + parks.name;
                        description.textContent = "Description: " + parks.description;
                        address.textContent = "Difficulty: " + parks.address;
                        elem.appendChild(name);
                        elem.appendChild(description);
                        elem.appendChild(address);

                   // })
                    document.getElementById("bike-parks").appendChild(elem);
                });
            } else {
                console.log(
                    "Looks like its not JSON but lets see what it is... " + req.responseText
                );
            }
        } else {
            console.log("Oh no... handle error");
        }
    };
    req.open("GET", "http://localhost:8080/getAllBikeParks");
    req.send();
}

function submitTrail(){
    let elements = document.getElementById("trail-form").elements;
    let obj ={};
    for(let i = 0 ; i < elements.length - 1 ; i++){
        let item = elements.item(i);
        obj[item.name] = item.value;
    }

    const req = new XMLHttpRequest();
    req.open("POST", "http://localhost:8080/createTrail");
    req.onload = () => {
        if (req.status === 200 && req.readyState == 4) {
            console.log("Server Responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    req.send(JSON.stringify({ title: obj.title, description: obj.description}));
}