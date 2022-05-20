import { createRouter, createWebHistory } from "vue-router";
import Home from "../views/Home.vue";
import About from "../views/About.vue";
import Pokedex from "../views/pokedex/Pokedex.vue";
import Login from "../views/Login";

const routes = [
  {
    path: "/",
    component: Home,
  },
  {
    path: "/about",
    component: About
  },
  {
    path: "/pokedex/:title?",
    component: Pokedex,
    props: true
  },
  {
    path: "/login",
    component: Login
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
