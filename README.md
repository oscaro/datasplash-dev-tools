# datasplash-dev-tools

Some preliminary tools for facilitating development with Datasplash. For now, just a simple function for lazily reading files created with the `:checkpoint` feature of Datasplash.

## Usage

```clojure
(take 10 (read-checkpoint "gs://my-bucket/my-checkpoint-name/" {:format :edn})
```

## License

Copyright © 2017 Oscaro

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
