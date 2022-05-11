import { createApp } from "vue";
import Pokedex from "./views/pokedex/Pokedex.vue";
import router from "./router";

createApp(Pokedex).use(router).mount("#app");
