<template>
    <div>
        <!-- 1. props 해보기-->
        <p>{{ myMsg }}</p>
        <!-- ParentGrandChild : <ParentGrandChild :my-msgg="myMsg"/> -->

        <!-- 2-1. emit 해보기 $emit 사용-->
        <!-- <button @click="$emit('someEvent')">부모에게 전송</button> -->

        <!-- 2-2. defineEmits 사용-->
        <button @click="buttonClick">someEvent</button>
        <button @click="emitArgs">emitArgs</button>
    </div>
</template>

<script setup>
    // import ParentGrandChild from '@/components/ParentGrandChild.vue'
    // 1. props선언할 때 문자 배열은 명시적이지 않다
    // defineProps(['myMsg'])

    // 2. 객체로 props 선언
    const props = defineProps({
        myMsg : String,
    })

    // 2-1. defineEmits
    const emit = defineEmits(['someEvent', 'emitArgs'])
    const buttonClick = () => {
        emit('someEvent')
    }
    const emitArgs = function(){
        emit('emitArgs', 2024, 5, 2)
    }

    // 부모에게 받은 props를 다시 손자에게 보내주기 -> v-bind 이용

    // console.log(props)
    // console.log(props.myMsg)
</script>