function displayBikeParks(){
    const req = new XMLHttpRequest();
    console.log("hello world");
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

                  parks.trails.forEach(trail => {
                        console.log(parks) // print all notes for each notebook
                        let trailName = document.createElement('p');
                        let trailDescription = document.createElement('p');
                        let colours = document.createElement('p');
                        trailName.textContent = "Trail Name: " + trail.trailName;
                        trailDescription.textContent = "Description: " + trail.trailDescription;
                        colours.textContent = "Address: " + trail.colours;
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
    req.send(JSON.stringify({ title: obj.title, description: obj.description}));
}