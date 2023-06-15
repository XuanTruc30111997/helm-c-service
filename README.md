# Getting Started

## Push to Docker Registry
* **Build package** mvn package -Dmaven.test.skip
* **Build Docker** docker build -t practice-helm/c-service:1.1.1 .
* **Tag Image** docker tag practice-helm/c-service:1.1.1 <repo>/helm-c-service:1.1.1
* **Push Image** docker push <repo>/helm-c-service:1.1.1

## Helm
* **Helm install:** helm install c-service-dev -n practice-helm ./charts
* **Helm get:** helm ls --all -n practice-helm
* **Helm upgrade:** helm upgrade c-service-dev -n practice-helm ./charts
* **Helm rollback to previous version:** helm rollback c-service-dev 1 -n practice-helm
* **Helm uninstall:** helm uninstall c-service-dev -n practice-helm

