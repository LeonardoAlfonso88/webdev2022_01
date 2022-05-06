<template>
  <p>{{ counter }}</p>
  <button @click="addCounter">Sustract</button>

  <div class="wrapper-form">
    <div class="wrapper-input">
      <label>Nombre: </label>
      <input type="text" class="form" v-model="person.name" />
      <p>{{ errors.errorName }}</p>
    </div>
    <div class="wrapper-input">
      <label>Apellido: </label>
      <input type="text" class="form" v-model="person.lastname" />
      <p>{{ errors.errorLastName }}</p>
    </div>
    <div class="wrapper-input">
      <label>Celular: </label>
      <input type="text" class="form" v-model="person.cellphone" />
      <p>{{ errors.errorCellphone }}</p>
    </div>
    <div class="wrapper-input">
      <label>Edad: </label>
      <input type="text" class="form" v-model="person.age" @input="checkAge" />
      <div class="wrapper-error" v-if="errors.errorAge != ''">
        <p>{{ errors.errorAge }}</p>
      </div>
    </div>
    <button @click="showInfo">Mostrar Datos</button>
  </div>
</template>

<script>
import { ref } from "vue";

export default {
  name: "App",
  setup() {
    const counter = ref(0);
    const person = ref({
      name: "",
      lastname: "",
      cellphone: "",
      age: 0,
    });
    const errors = ref({
      errorName: "",
      errorLastName: "",
      errorCellphone: "",
      errorAge: "",
    });

    function checkAge(event) {
      const actualAge = event.target.value;
      if (actualAge > 25) {
        errors.value.errorAge = "Edad fuera de rango";
      } else {
        errors.value.errorAge = "";
      }
    }
    // const name = ref("");
    // const lastname = ref("");
    // const cellphone = ref("");
    // const age = ref(0);

    function addCounter() {
      counter.value--;
    }

    function showInfo() {
      console.log(person.value);
      // console.log(lastname)
      // console.log(cellphone)
      // console.log(age)
    }

    // watch(
    //     () => name.value,
    //     () => {
    //       console.log(name.value);
    //     }
    // );

    return {
      counter,
      addCounter,
      // name,
      // lastname,
      // cellphone,
      // age,
      showInfo,
      person,
      errors,
      checkAge,
    };
  },
};
</script>

<style>
.form {
  margin-top: 2rem;
}

.wrapper-error {
  border: 1px solid red;
}
</style>
