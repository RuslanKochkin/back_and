const vehicle = {
    speed: 40,
    capacity: 4,
    drive(){
        console.log('svgfe')
    }
}
const jeep = {
    __proto__: vehicle,
    speed: 60,
    capacity: 5,
    numberOfDoors: 2
}
console.log(jeep.drive());

const toyota = {
    speed: 180,
    capacity: 2,
    numberOfDoors: 2,
    gas(){
        console.log()
    }
}
console.log(toyota.gas());