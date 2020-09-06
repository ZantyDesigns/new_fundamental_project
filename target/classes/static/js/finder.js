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
                    let parkName = document.createElement('h1');
                    parkName.textContent = "Bike Park name: " + parks.name;
                    elem.appendChild(parkName);

                    let parkAddress = document.createElement('h2');
                    parkAddress.textContent = "Address: " + parks.address;
                    elem.appendChild(parkAddress);

                    let parkCounty = document.createElement('h3');
                    parkCounty.textContent = "County: " + parks.county;
                    elem.appendChild(parkCounty);

                    let parkDesc = document.createElement('h4');
                    parkDesc.textContent = "Description: " + parks.description;
                    elem.appendChild(parkDesc);

                  parks.trails.forEach(trail => {
                        console.log(parks) // print all notes for each notebook
                        let trailName = document.createElement('p');
                        let trailDescription = document.createElement('p');
                        let colours = document.createElement('p');
                        trailName.textContent = "Trail Name: " + trail.trailName;
                        trailDescription.textContent = "Description: " + trail.trailDescription;
                        colours.textContent = "Difficulty: " + trail.colours;
                        elem.appendChild(trailName);
                        elem.appendChild(trailDescription);
                        elem.appendChild(colours);

                   })
                    document.getElementById("container").appendChild(elem);
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

function submitPark(){
    let elements = document.getElementById("park-form").elements;
    let obj ={};
    for(let i = 0 ; i < elements.length - 1 ; i++){
        let item = elements.item(i);
        obj[item.name] = item.value;
    }

    const req = new XMLHttpRequest();
    req.open("POST", "http://localhost:8080/createBikeParks");
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server Responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    req.send(JSON.stringify({ name: obj.name, address: obj.address, county: obj.county, description: obj.description }));
}