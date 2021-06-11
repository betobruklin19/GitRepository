 <div>
    <!-- Modal novo -->
    <div>
    
    <div/>
</template>

<script>


export default {
  data() {
    return {
      visible: false,
    
    };
  },


  created() {
    this.$root.$on("open-modal-novo", () => {
      this.visible = true;
    });
  },
};
</script>


<style scoped>

</style>