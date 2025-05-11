<script setup>
import {  onMounted } from 'vue'
import  axios  from "axios";
onMounted(()=>{

  axios.get('/list').then(res=>{
    let a  = res.data
    console.log(a);
    console.log(typeof(a));
    console.log(res.data);
   
    
  });
  console.log("about page");
  
});
</script>

<template>
  <div class="about">
    <h1>This is an about page</h1>
  </div>
</template>

<style>
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>
