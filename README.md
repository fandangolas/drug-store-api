# Drug Store Api

Drug Store Api is an API written to learn more about Clojure. It uses Pedestal.io and connects with a Postgres instance using HugSQL.

In general, it's just a simple API that manages a drugs stock.

## Features

**_List all the drugs on the store_**
> Method: `[GET]` </br>
> Endpoint: `/drugs` </br>
> Authentication: `None` </br>
> Query Parameters - `None` 

Example response:

Response [200]
```json
[
    {
        "id": 1,
        "name": "Vicodin, Norco, Xodol (hydrocodone, acetaminophen)",
        "availability": 100,
        "price": 14.0
    },
    {
        "id": 2,
        "name": "Synthroid, Levoxyl, Unithroid (levothyroxine)",
        "availability": 200,
        "price": 11.0
    }
]
```