<template>
  <ul>
    <li>
      <router-link to="/">Home</router-link>
    </li>
    <li>
      <router-link to="/about">About</router-link>
    </li>
    <li>
      <router-link :to="'/pokedex/'.concat(title)">Pokedex</router-link>
    </li>
  </ul>
  <router-view />
</template>

<script>
import { onErrorCaptured, ref } from "vue";

export default {
  name: "App",
  setup() {
    const title = ref("Ejemplo");

    onErrorCaptured((error) => {
      alert(error.message);
    });

    return {
      title,
    };
  },
};
</script>

<style></style>
