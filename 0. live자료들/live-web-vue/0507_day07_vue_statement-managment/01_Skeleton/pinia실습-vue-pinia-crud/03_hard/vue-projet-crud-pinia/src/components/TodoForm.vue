<template>
    <div>
        <form>
            <input type="text" v-model="todoText">
            <input type="submit">
        </form>
    </div>
</template>
<script setup>
    import { useCounterStore } from '@/stores/counter'

    const store = useCounterStore()
    const createTodo = function(todoText) {
        store.createTodo(todoText)
    }
</script>
<style>
    
</style>