<template>
    <div>
        <h2>TodoList입니다</h2>
        <TodoListItem
            v-for="todo in store.todos"
            :key="todo.id"
            :my-todo="todo"
        />
    </div>
</template>
<script setup>
    import TodoListItem from '@/components/TodoListItem.vue'

    import { useCounterStore } from '@/stores/counter'

    const store = useCounterStore()
</script>
<style>
    
</style>