<!-- 부모가 있는 곳입니다 -->
<template>
    <div>
        <!-- props 해보기 -->
        <!-- ParentChild: <ParentChild my-msg="엄마 사랑해요!"/> -->
        
        <!-- emit 해보기 -->
        <!-- 1. $emit 사용-->
        emitTest(Parent) : 
        <ParentChild 
            @some-event="someCallback"
            @emit-args="getNumbers"/>

    </div>
</template>

<script setup>
import ParentChild from '@/components/ParentChild.vue'

// 2-1. $emit으로 넘어왔을 때 부모에서 해 줄 일
const someCallback = function(){
    console.log("잘 넘어왔나요??")
}

const getNumbers = function(...args){
    console.log(args)
    console.log(`${args}를 추가했습니다`)
}
</script>