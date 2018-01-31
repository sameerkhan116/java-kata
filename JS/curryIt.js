var curryIt = function(func) {
    let args = [], that;
    return function() {
        if(this && !that) that = this;
        if(arguments.length > 0) args.push.apply(args, arguments);
        else {
            try {
                return func.apply(that, args);
            }
            finally {
                args = [];
            }
        }
    }
}