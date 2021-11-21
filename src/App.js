import {Component} from "react";
import './App.css'
import Cabecalho from "./Header";
import Rodaper from "./Rodaper";
import Carousel from "./imagens"


export default class Home extends Component{

    render() {
        return (
            <article>
                <Cabecalho/>
                <Carousel/>
                <meio>
                    <h1>Produtos</h1>
                </meio>
                <Rodaper/>
            </article>
        );
    }
}