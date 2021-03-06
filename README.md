# `gotrue-java WIP` ![CI](https://github.com/supabase/gotrue-java/workflows/CI/badge.svg?branch=master) [![codecov](https://codecov.io/gh/supabase/gotrue-java/branch/master/graph/badge.svg?token=V2T6WRH9CB)](https://codecov.io/gh/supabase/gotrue-java)

A Java client library for the [GoTrue](https://github.com/supabase/gotrue) API.

# Installation

WIP

# Configuration

Via properties file or environment variables. If both are specified the ones from the environment are used.

## Environment

Url of the GoTrue Server.

```environment
GOTRUE_URL=https://...
```

Default headers that are included with every request to the API.

```environment
GOTRUE_HEADERS=MyHeader=MyValue, Header2=Val
// or
GOTRUE_HEADERS=MyHeader:MyValue, Header2:Val
```

The GoTrue JWT secret to validate jwt Tokens.

```environment
GOTRUE_JWT_SECRET=superSecretJwtToken
```

## Properties

Url of the GoTrue Server.

```properties
gotrue.url=https://...
```

Default headers that are included with every request to the API.

```properties
gotrue.headers=MyHeader:MyValue, Header2:Val
// or
gotrue.headers=MyHeader=MyValue, Header2=Val
```

The GoTrue JWT secret to validate jwt Tokens.

```properties
gotrue.jwt.secret=superSecretJwtToken
```

# Documentation

- [JavaDoc](https://supabase.github.io/gotrue-java/)

# ToDo

- ~~[ ] support OAuth~~
- [ ] deploy to maven
- [ ] deploy to gradle?

# Development

Start infrastructure for testing.

```bash
cd infra
docker compose up
```
