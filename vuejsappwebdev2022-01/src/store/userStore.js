import { readonly, ref } from "vue";

const emptyUser = {
  id: "",
  name: "",
  lastName: "",
  email: "",
};

const user = ref(emptyUser);

export function userStore() {
  function updateUser(newUser) {
    user.value = newUser;
  }

  function logOut() {
    user.value = emptyUser;
  }

  return {
    user: readonly(user),
    updateUser,
    logOut,
  };
}
