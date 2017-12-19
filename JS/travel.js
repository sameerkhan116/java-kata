// function travel(r, zipcode) {
//     nums = r.split(",").map(x => x.match(/\b\d{1,}/)[0]);
//     address = r.split(",").map(x => x.replace(/[0-9]{1,}/g, "")).map(x => (x.replace(/[A-Z]{2}/, "").trim()));
//     pincode = r.split(",").map(x => x.match(/[A-Z]{2}\s\d{5}\b/)[0]);
//     var x = zipcode + ":";
//     if(!pincode.includes(zipcode)) {
//         x += "/";
//         return x;
//     }
//     for(var i = 0; i < pincode.length; i++) {
//         if(pincode[i] === zipcode) {
//             x += address[i] + ",";
//         }
//     }
//     x = x.substring(0, x.length - 1) + "/";
//     for(var i = 0; i < pincode.length; i++) {
//         if(pincode[i] === zipcode) {
//             x += nums[i] + ",";
//         }
//     }
//     x = x.substring(0, x.length - 1  
//     return x;
// }

function travel(r, zipcode) {
    var re = /(\d{1,4}) (.*?) (\w{2} \d{4,5}),?/gi
    var res = {
      prefix: zipcode + ':',
      addr: [],
      nb: [],
    }
    while(arr = re.exec(r)){
      var [_ , nb, addr, zip] = arr
      if(zip != zipcode)
        continue
      res.addr.push(addr)
      res.nb.push(nb)
    }
    return res.prefix + res.addr.join(',') + '/' + res.nb.join(',')
}

const ad = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432,"
  + "54 Holy Grail Street Niagara Town ZP 32908,3200 Main Rd. Bern AE 56210,1 Gordon St. Atlanta RE 13000,"
  + "10 Pussy Cat Rd. Chicago EX 34342,10 Gordon St. Atlanta RE 13000,58 Gordon Road Atlanta RE 13000,"
  + "22 Tokyo Av. Tedmondville SW 43098,674 Paris bd. Abbeville AA 45521,10 Surta Alley Goodtown GG 30654,"
  + "45 Holy Grail Al. Niagara Town ZP 32908,320 Main Al. Bern AE 56210,14 Gordon Park Atlanta RE 13000,"
  + "100 Pussy Cat Rd. Chicago EX 34342,2 Gordon St. Atlanta RE 13000,5 Gordon Road Atlanta RE 13000,"
  + "2200 Tokyo Av. Tedmondville SW 43098,67 Paris St. Abbeville AA 45521,11 Surta Avenue Goodtown GG 30654,"
  + "45 Holy Grail Al. Niagara Town ZP 32918,320 Main Al. Bern AE 56215,14 Gordon Park Atlanta RE 13200,"
  + "100 Pussy Cat Rd. Chicago EX 34345,2 Gordon St. Atlanta RE 13222,5 Gordon Road Atlanta RE 13001,"
  + "2200 Tokyo Av. Tedmondville SW 43198,67 Paris St. Abbeville AA 45522,11 Surta Avenue Goodville GG 30655,"
  + "2222 Tokyo Av. Tedmondville SW 43198,670 Paris St. Abbeville AA 45522,114 Surta Avenue Goodville GG 30655,"
  + "2 Holy Grail Street Niagara Town ZP 32908,3 Main Rd. Bern AE 56210,77 Gordon St. Atlanta RE 13000"

const code = "OH 43071,NY 56432,ZP 32908,AE 56210,RE 13000,EX 34342,SW 43098,AA 45521,GG 30654,ZP 32908,AE 56215,RE 13200,EX 34345,"
    + "RE 13222,RE 13001,SW 43198,AA 45522,GG 30655,XX 32321,YY 45098"

// console.log(travel(ad, code));
console.log(travel(ad, "AA 45522"));
console.log(travel(ad, "EX 34342"));
console.log(travel(ad, "Ahjgadsjh"));
