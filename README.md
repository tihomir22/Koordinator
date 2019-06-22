# Koordinator
```
{"swagger":"2.0","info":{"description":"Microservice which manages the prices of any Cryptocurrency","version":"1.0","title":"Koordinator","termsOfService":"https://www.termsofservicegenerator.net/live.php?token=0BgpgQO9jW1OqNx2JpWR7zVev0Kklq7v","contact":{"name":"Tihomir Stoychev Stoychev","url":"www.linkedin.com/in/tihomir-stoychev-stoychev","email":"tihomir_alcudia3@hotmail.com"},"license":{"name":"Apache 2.0","url":"http://www.apache.org/licenses/LICENSE-2.0"}},"host":"localhost:8090","basePath":"/","tags":[{"name":"basic-error-controller","description":"Basic Error Controller"},{"name":"controlador-precios","description":"Controlador Precios"}],"consumes":["application/xml","application/json"],"produces":["application/xml","application/json"],"paths":{"/error":{"get":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingGET","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}},"deprecated":false},"head":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingHEAD","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"204":{"description":"No Content"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"}},"deprecated":false},"post":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingPOST","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"201":{"description":"Created"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}},"deprecated":false},"put":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingPUT","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"201":{"description":"Created"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}},"deprecated":false},"delete":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingDELETE","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"204":{"description":"No Content"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"}},"deprecated":false},"options":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingOPTIONS","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"204":{"description":"No Content"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"}},"deprecated":false},"patch":{"tags":["basic-error-controller"],"summary":"error","operationId":"errorUsingPATCH","responses":{"200":{"description":"OK","schema":{"type":"object","additionalProperties":{"type":"object"}}},"204":{"description":"No Content"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"}},"deprecated":false}},"/precios":{"post":{"tags":["controlador-precios"],"summary":"insert","operationId":"insertUsingPOST","parameters":[{"in":"body","name":"activo","description":"activo","required":true,"schema":{"$ref":"#/definitions/PrecioActivo"}}],"responses":{"200":{"description":"OK"},"201":{"description":"Created"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}},"deprecated":false}},"/precios/":{"get":{"tags":["controlador-precios"],"summary":"getAll","operationId":"getAllUsingGET","responses":{"200":{"description":"OK","schema":{"type":"array","items":{"$ref":"#/definitions/PrecioActivo"}}},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}},"deprecated":false}},"/precios/{id}":{"delete":{"tags":["controlador-precios"],"summary":"delete","operationId":"deleteUsingDELETE","parameters":[{"name":"id","in":"path","description":"id","required":true,"type":"string"}],"responses":{"200":{"description":"OK"},"204":{"description":"No Content"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"}},"deprecated":false}},"/precios/{parbase}/{parcontra}":{"get":{"tags":["controlador-precios"],"summary":"recuperarPrecioActivo","operationId":"recuperarPrecioActivoUsingGET","parameters":[{"name":"parbase","in":"path","description":"parbase","required":true,"type":"string"},{"name":"parcontra","in":"path","description":"parcontra","required":true,"type":"string"}],"responses":{"200":{"description":"OK","schema":{"$ref":"#/definitions/Optional«PrecioActivo»"}},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}},"deprecated":false}}},"definitions":{"ModelAndView":{"type":"object","properties":{"empty":{"type":"boolean"},"model":{"type":"object"},"modelMap":{"type":"object","additionalProperties":{"type":"object"}},"reference":{"type":"boolean"},"status":{"type":"string","enum":["100 CONTINUE","101 SWITCHING_PROTOCOLS","102 PROCESSING","103 CHECKPOINT","200 OK","201 CREATED","202 ACCEPTED","203 NON_AUTHORITATIVE_INFORMATION","204 NO_CONTENT","205 RESET_CONTENT","206 PARTIAL_CONTENT","207 MULTI_STATUS","208 ALREADY_REPORTED","226 IM_USED","300 MULTIPLE_CHOICES","301 MOVED_PERMANENTLY","302 FOUND","302 MOVED_TEMPORARILY","303 SEE_OTHER","304 NOT_MODIFIED","305 USE_PROXY","307 TEMPORARY_REDIRECT","308 PERMANENT_REDIRECT","400 BAD_REQUEST","401 UNAUTHORIZED","402 PAYMENT_REQUIRED","403 FORBIDDEN","404 NOT_FOUND","405 METHOD_NOT_ALLOWED","406 NOT_ACCEPTABLE","407 PROXY_AUTHENTICATION_REQUIRED","408 REQUEST_TIMEOUT","409 CONFLICT","410 GONE","411 LENGTH_REQUIRED","412 PRECONDITION_FAILED","413 PAYLOAD_TOO_LARGE","413 REQUEST_ENTITY_TOO_LARGE","414 URI_TOO_LONG","414 REQUEST_URI_TOO_LONG","415 UNSUPPORTED_MEDIA_TYPE","416 REQUESTED_RANGE_NOT_SATISFIABLE","417 EXPECTATION_FAILED","418 I_AM_A_TEAPOT","419 INSUFFICIENT_SPACE_ON_RESOURCE","420 METHOD_FAILURE","421 DESTINATION_LOCKED","422 UNPROCESSABLE_ENTITY","423 LOCKED","424 FAILED_DEPENDENCY","426 UPGRADE_REQUIRED","428 PRECONDITION_REQUIRED","429 TOO_MANY_REQUESTS","431 REQUEST_HEADER_FIELDS_TOO_LARGE","451 UNAVAILABLE_FOR_LEGAL_REASONS","500 INTERNAL_SERVER_ERROR","501 NOT_IMPLEMENTED","502 BAD_GATEWAY","503 SERVICE_UNAVAILABLE","504 GATEWAY_TIMEOUT","505 HTTP_VERSION_NOT_SUPPORTED","506 VARIANT_ALSO_NEGOTIATES","507 INSUFFICIENT_STORAGE","508 LOOP_DETECTED","509 BANDWIDTH_LIMIT_EXCEEDED","510 NOT_EXTENDED","511 NETWORK_AUTHENTICATION_REQUIRED"]},"view":{"$ref":"#/definitions/View"},"viewName":{"type":"string"}},"title":"ModelAndView"},"Optional«PrecioActivo»":{"type":"object","properties":{"present":{"type":"boolean"}},"title":"Optional«PrecioActivo»"},"PrecioActivo":{"type":"object","properties":{"id":{"type":"string"},"precio":{"type":"number","format":"double"}},"title":"PrecioActivo"},"View":{"type":"object","properties":{"contentType":{"type":"string"}},"title":"View"}}}

```