class Lazy {
    constructor() {
        this.chain = [];
    }

    add(fn, ...args) {
        this.chain.push(fn.bind(this, ...args));
        return this;
    }

    invoke(args) {
        return this.chain.reduce((args, fn) => fn(...args), args);
    }
}