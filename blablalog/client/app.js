const app = Vue.createApp({
    data() {
        return {
            firstName: 'John',
            lastName: 'Doe',
            email: 'john@gmail.com',
            gender: 'male',
            picture: 'https://randomuser.me/api/portraits/men/10.jpg'
        }
    },
    methods: {
        async getUser() {
            const res = await fetch('https://randomuser.me/api')
            const { results } = await res.json() //result object(array) that has a single user info

            var info = results[0]
            this.firstName = info.name.first
            this.lastName = info.name.last
            this.email = info.email
            this.gender = info.gender
            this.picture = info.picture.large
        }
    }
})

app.mount('#app')