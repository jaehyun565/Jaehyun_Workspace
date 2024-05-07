<template>
    <div>
        <p>
            {{ myMsgg }}
        </p>
    </div>
</template>

<script setup>
    defineProps({
        myMsgg : String,        
    })
</script>