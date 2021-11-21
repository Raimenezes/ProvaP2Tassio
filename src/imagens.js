import img1 from "./img/imgCar.png"

function Carousel(){
    return(
        <carousel>
            <div class="textin">
                <h1>Nossa especialidade: experiência de compra</h1>
            </div>
            <div>
                <img class="Imagee" src={img1}/>
            </div>
        </carousel>
    )
}

export default Carousel;
