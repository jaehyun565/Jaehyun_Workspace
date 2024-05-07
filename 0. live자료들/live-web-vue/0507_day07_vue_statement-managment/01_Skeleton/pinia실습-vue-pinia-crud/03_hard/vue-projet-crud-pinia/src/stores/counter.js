import { ref, computed } from 'vue'

import { defineStore }from 'pinia'

// store
export const useCounterStore = defineStore('counter', () => {
    let id = 1

    const todos = ref([
        { id : id++, text: '보충하기', isDone: false},
        { id : id++, text: '점심먹기', isDone: false},
        { id : id++, text: '실습하기', isDone: false},
        { id : id++, text: '퇴근하기', isDone: false},
    ])
})